# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: ai-test.spec.js >> AI Playwright Agent Test
- Location: tests\ai-test.spec.js:4:5

# Error details

```
Error: 401 Incorrect API key provided: test-key***********heck. You can find your API key at https://platform.openai.com/account/api-keys.
```

# Test source

```ts
  1  | require("dotenv").config();
  2  | const OpenAI = require("openai");
  3  | const promptTemplate = require("./promptTemplate");
  4  | 
  5  | const client = new OpenAI({
  6  |   apiKey: process.env.OPENAI_API_KEY,
  7  | });
  8  | 
  9  | async function generatePlaywrightCode(task) {
  10 |   const prompt = promptTemplate(task);
  11 | 
> 12 |   const response = await client.chat.completions.create({
     |                    ^ Error: 401 Incorrect API key provided: test-key***********heck. You can find your API key at https://platform.openai.com/account/api-keys.
  13 |     model: "gpt-4.1-mini",
  14 |     messages: [{ role: "user", content: prompt }],
  15 |   });
  16 | 
  17 |   return response.choices[0].message.content;
  18 | }
  19 | 
  20 | module.exports = generatePlaywrightCode;
```