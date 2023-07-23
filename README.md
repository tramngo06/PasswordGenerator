# Password Generator

##Introduction
Password Generator is an effective tool for creating secure passwords for internet accounts. It improves digital security and deters hacking attempts by randomly creating complicated combinations of characters, numbers, and symbols. These special passwords can be relied upon by users to securely protect their confidential data and reduce the possibility of illegal access.

In this project, I will implement to build a basic Password Generator which has these function: 
* Provide users the amount of passwords they're desired.
* Provide user a random passsword which containing: a-z, A-Z, 1-9, and ~`! @#$%^&*()_-+={[}]|\:;"'<,>.?/.
* Check the strength of the password: weak/medium/good/great.

## Functionalities
### Generating Password
1. The user chooses the password length.
2. A set of characters is created based on the user's choices.
3. Random characters are picked from this set to form a unique passwor ( a-z, A-Z, 1-9, and ~`! @#$%^&*()_-+={[}]|\:;"'<,>.?/)
4. The newly generated password is shown on the screen.

### Checking the password's strength 
Checking password's strength system will contain the following conditions:
1. Has Upper Case.
2. Has Lower Case.
3. Has Symbol.
4. Has Number
5. The length of password will be at least 8.

The system will show that how strong is the password based on the score of condition. For example: Weak (score <= 2), Medium(score =3), Good(score =4), Greate (score >=4).




