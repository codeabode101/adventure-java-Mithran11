🏕️ 5-Day Java Project: Simple Adventure Choices
Make a small game where your choices change the story!

---
### Day 1: Start Your Journey
1.  Make a new Java file called `AdventureGame.java`.
2.  Inside `main`, create a `Scanner` and ask the player: "What is your name?". Store it in a `String`.
3.  Print a welcome message: "Welcome, [Player Name]! Your adventure begins..."
4.  Ask the player: "You are at a crossroads. Do you go (1) Left or (2) Right?". Store their choice as an `int`.
5.  Use an `if-else` statement. If choice is 1, print "You chose the left path." If choice is 2, print "You chose the right path."
6.  Close the `Scanner`.
    *Input/Output Example:*
    ```
    What is your name?
    Alex
    Welcome, Alex! Your adventure begins...
    You are at a crossroads. Do you go (1) Left or (2) Right?
    1
    You chose the left path.
    ```
---
### Day 2: Deeper Paths
1.  **Keep all your code from Day 1.**
2.  Inside your `if (choice == 1)` block (for the left path), ask: "You see (1) a river or (2) a forest. Which way?". Store this new choice.
3.  Use an `if-else` *inside* the left path block to print a message for the river or forest choice.
4.  Do the same for your `else` block (for the right path). Ask: "You see (1) a mountain or (2) a village. Which way?". Store this choice and use `if-else` to print messages.
    *Input/Output Example (if initial choice was 1):*
    ```
    What is your name?
    Pat
    Welcome, Pat! Your adventure begins...
    You are at a crossroads. Do you go (1) Left or (2) Right?
    1
    You chose the left path.
    You see (1) a river or (2) a forest. Which way?
    2
    You entered the deep forest.
    ```
---
### Day 3: Secret Words and Smart Choices
1.  **Keep all your code from Day 2.**
2.  At the beginning of your game (after getting the player's name but before the first path choice), ask: "What is the secret word you whisper?". Store it in a `String`.
3.  Use `.trim().toLowerCase()` on this secret word to clean it up.
4.  **Find ONE of your path choices from Day 2** (e.g., the "river" choice inside the "left path").
5.  Inside *that specific choice's block*, use a `nested if` statement:
    *   `if (secretWord.equals("magic")) { print "A secret bridge appears over the river!"; } else { print "The river is too wide to cross."; }`
6.  **(After core implementation)** Now, find another choice in your game (like the "forest" path). Add a new `nested if` check there: if the `secretWord.equals("friend")`, print a special message like "Friendly animals greet you in the forest!".
    *Input/Output Example (if initial choice 1, path 1, and secret word " magic "):*
    ```
    What is your name?
    Sam
    What is the secret word you whisper?
     magic
    Welcome, Sam! Your adventure begins...
    You are at a crossroads. Do you go (1) Left or (2) Right?
    1
    You chose the left path.
    You see (1) a river or (2) a forest. Which way?
    1
    A secret bridge appears over the river!
    ```
---
### Day 4: Finding Special Items
1.  **Keep all your code from Day 3.**
2.  At the start of your `main` method, create a new `int` variable: `int itemsFound = 0;`.
3.  **Find at least TWO different places** in your adventure where a player makes a good choice (e.g., finding the "secret bridge" from Day 3, or choosing the "village" on Day 2).
4.  Inside *those specific `if` blocks*, add `itemsFound = itemsFound + 1;` (or `itemsFound++;`).
5.  At the very end of your `main` method (just before `input.close()`), print: "You found [itemsFound] special items on your journey!"
    *Input/Output Example (showing the new end message):*
    ```
    ... (rest of your game interaction) ...
    A secret bridge appears over the river!
    You found 1 special items on your journey!
    ```
---
### Day 5: Your Own Adventure Twist
1.  **Keep all your code from Day 4.**
2.  **Choose ONE existing `if-else if-else` block** in your game (for example, the choices for river/forest, or mountain/village).
3.  Add a *new* choice option (e.g., a "3rd" option if you only had 2 before, or a "4th" option) to *that specific block*. Make sure to update the prompt (e.g., "You see (1) river, (2) forest, or (3) cave?").
4.  Inside the `else if` or `else` for your new choice, print a simple new message.
5.  Have this new choice either *add 1* to `itemsFound` (like `itemsFound++;`) or *subtract 1* from `itemsFound` (like `itemsFound--;`).
    *Input/Output Example (if you added a "Cave" option to the river/forest choice, and it adds an item):*
    ```
    ...
    You see (1) a river, (2) a forest, or (3) a dark cave. Which way?
    3
    You bravely entered the dark cave!
    You found 2 special items on your journey!
    ```
