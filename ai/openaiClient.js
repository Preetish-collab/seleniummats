const path = require("path");
const dotenv = require("dotenv");
const OpenAI = require("openai");
const promptTemplate = require("./promptTemplate");

dotenv.config({ path: path.resolve(__dirname, "../.env") });
dotenv.config({ path: path.resolve(__dirname, "../key.env") });

function getOpenAIClient() {
  const apiKey = process.env.OPENAI_API_KEY?.trim();

  if (!apiKey) {
    throw new Error(
      "OPENAI_API_KEY is missing. Add it to E:\\playwrightTS\\.env or E:\\playwrightTS\\key.env."
    );
  }

  return new OpenAI({ apiKey });
}

async function generatePlaywrightCode(task) {
  const client = getOpenAIClient();
  const prompt = promptTemplate(task);

  try {
    const response = await client.chat.completions.create({
      model: "gpt-4.1-mini",
      messages: [{ role: "user", content: prompt }],
    });

    return response.choices[0].message.content;
  } catch (error) {
    if (error?.status === 429) {
      throw new Error(
        "OpenAI API quota is exhausted. Add credits to the API project or configure a funded OPENAI_API_KEY."
      );
    }

    throw error;
  }
}

module.exports = generatePlaywrightCode;