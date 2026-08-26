# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: aitest.spec.ts >> AI Playwright Agent Test
- Location: tests\aitest.spec.ts:4:5

# Error details

```
Error: OPENAI_API_KEY is missing. Add it to E:\playwrightTS\.env.
```

# Test source

```ts
  1  | const path = require("path");
  2  | const dotenv = require("dotenv");
  3  | const OpenAI = require("openai");
  4  | const promptTemplate = require("./promptTemplate");
  5  | 
  6  | dotenv.config({ path: path.resolve(__dirname, "../.env") });
  7  | 
  8  | function getOpenAIClient() {
  9  |   const apiKey = process.env.OPENAI_API_KEY?.trim();
  10 | 
  11 |   if (!apiKey) {
> 12 |     throw new Error(
     |           ^ Error: OPENAI_API_KEY is missing. Add it to E:\playwrightTS\.env.
  13 |       "OPENAI_API_KEY is missing. Add it to E:\\playwrightTS\\.env."
  14 |     );
  15 |   }
  16 | 
  17 |   return new OpenAI({ apiKey });
  18 | }
  19 | 
  20 | async function generatePlaywrightCode(task) {
  21 |   const client = getOpenAIClient();
  22 |   const prompt = promptTemplate(task);
  23 | 
  24 |   const response = await client.chat.completions.create({
  25 |     model: "gpt-4.1-mini",
  26 |     messages: [{ role: "user", content: prompt }],
  27 |   });
  28 | 
  29 |   return response.choices[0].message.content;
  30 | }
  31 | 
  32 | module.exports = generatePlaywrightCode;
```