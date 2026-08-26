# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: aitest.spec.ts >> AI Playwright Agent Test
- Location: tests\aitest.spec.ts:4:5

# Error details

```
ReferenceError: client is not defined
```

# Test source

```ts
  1  | require("dotenv").config();
  2  | const OpenAI = require("openai");
  3  | const promptTemplate = require("./promptTemplate");
  4  | import dotenv from 'dotenv';
  5  | dotenv.config();
  6  | export function getOpenAIClient() {
  7  | 
  8  | if (!process.env.OPENAI_API_KEY) {
  9  |   throw new Error("OPENAI_API_KEY is missing. Add it to the local .env file.");
  10 | }
  11 | return new OpenAI({ apiKey: process.env.OPENAI_API_KEY });
  12 | }
  13 | 
  14 | // const client = new OpenAI({
  15 | //   apiKey: process.env.OPENAI_API_KEY,
  16 | // });
  17 | 
  18 | async function generatePlaywrightCode(task) {
  19 |   const prompt = promptTemplate(task);
  20 | 
> 21 |   const response = await client.chat.completions.create({
     |                    ^ ReferenceError: client is not defined
  22 |     model: "gpt-4.1-mini",
  23 |     messages: [{ role: "user", content: prompt }],
  24 |   });
  25 | 
  26 |   return response.choices[0].message.content;
  27 | }
  28 | 
  29 | module.exports = generatePlaywrightCode;
```