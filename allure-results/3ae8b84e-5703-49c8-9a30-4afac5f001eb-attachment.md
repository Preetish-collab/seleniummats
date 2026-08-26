# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: aitest.spec.ts >> AI Playwright Agent Test
- Location: tests\aitest.spec.ts:4:5

# Error details

```
Test timeout of 30000ms exceeded.
```

```
Error: locator.click: Test timeout of 30000ms exceeded.
Call log:
  - waiting for locator('a:has(h3)').first()
    - waiting for "https://www.google.com/search?q=Playwright&sca_esv=7bf78debd29e0bdd&source=hp&ei=3CuPaqaWN6qhnesPrcvY8QQ&iflsig=ABILxe8AAAAAao857KddOruaRE676FYr_rLhTsEf3S5e&ved=0ahUKEwim9K348b6WAxWqUGcHHa0lNk4Q4dUDC…" navigation to finish...
    - navigated to "https://www.google.com/search?q=Playwright&sca_esv=7bf78debd29e0bdd&source=hp&ei=3CuPaqaWN6qhnesPrcvY8QQ&iflsig=ABILxe8AAAAAao857KddOruaRE676FYr_rLhTsEf3S5e&ved=0ahUKEwim9K348b6WAxWqUGcHHa0lNk4Q4dUDC…"

```

# Page snapshot

```yaml
- generic [ref=f3e2]:
  - separator [ref=f3e3]
  - iframe [ref=f3e8]:
    - generic [ref=f4e2]:
      - generic [ref=f4e3]:
        - checkbox "I'm not a robot" [ref=f4e7]
        - generic [ref=f4e9]: I'm not a robot
      - generic [ref=f4e12]: reCAPTCHA
  - separator [ref=f3e9]
  - generic [ref=f3e10]:
    - text: About this page Our systems have detected unusual traffic from your computer network. This page checks to see if it's really you sending the requests, and not a robot.
    - link "Why did this happen?" [ref=f3e11] [cursor=pointer]:
      - /url: "#"
    - generic [ref=f3e12]: "IP address: 2401:4900:1f29:897c:700c:702b:e867:369Time: 2026-08-26T18:09:35ZURL: https://www.google.com/search?q=Playwright&sca_esv=7bf78debd29e0bdd&source=hp&ei=3CuPaqaWN6qhnesPrcvY8QQ&iflsig=ABILxe8AAAAAao857KddOruaRE676FYr_rLhTsEf3S5e&ved=0ahUKEwim9K348b6WAxWqUGcHHa0lNk4Q4dUDCB4&uact=5&oq=Playwright&gs_lp=Egdnd3Mtd2l6IgpQbGF5d3JpZ2h0SBhQAFgAcAB4AJABAJgBAKABAKoBALgBA8gBAPgBAZgCAKACAJgDAJIHAKAHALIHALgHAMIHAMgHAIAIAQ&sclient=gws-wiz&sei=3iuPateeE4zZseMPs5XusQY"
```