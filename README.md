# CMPSC 100-03 Lab Session 7: Bibliomancy
* Assigned: 28 October 2019
* Due: 4 November 2019
* Point value: 45 pts

In this laboratory session, we explore topics including: 

* `while` loops
* Java `iterators`
* The `ArrayList`
* Interacting with and managing program "flow-of-control"
* Internal and external methods and objects

## General guidelines for laboratory sessions

* **Follow steps carefully.** Laboratory sessions often get a bit more complicated than their preceeding Practical sessions. Especially for early sessions which expose you to platforms with which you may not be familiar, take notes on `command`s you run and their corresponding effects/outputs. If you find yourself stuck on a step, let a TL or the professor know! Laboratory sessions do not mean that we won't help you in the same way we do during Practicals.
* **Regularly ask and answer questions.** Some of you may have more experience with the topics we're discussing than others. We can use this knowledge to our advantage. But, like in Practicals, let students try things for a while before offering help (**always _offer_ first**). To ask questions, use our [Slack](https://cmpsc100fall2019.slack.com)'s `#labs` channel.
* **Store and transfer files using GitHub.** Various forms of file storage are more or less volatile. *You* are responsible for backing up and storing files. If you're unsure of files which have been changed, you can always type `git status` in the terminal for your working folder to determine what you need to back up.
* **Keep all of your files.** See above, but also remember that you're responsible for the files you create.
* **Back up your files regularly.** See above (& above-above).
* **Review the [Honor Code](https://sites.allegheny.edu/about/honor-code/) reguarly when working.** If you're taking a solution from another student or the Internet at-large (_especially_ [Stack Overflow](https://stackoverflow.com)), bear in mind that using these solutions _can_ constitute a form of plagiarism that violates the Allegheny Honor Code. While it may seem easy and convenient to use these sources, it is equally easy and convenient to rely on them and create bad habits which include not attributing credit or relying exclusively on others to solve issues. Neither are productive uses of your intellect. Really.

## Further helpful reading for this assignment

If you have not already done so, I recommend reading the [GitHub Guides](https://guides.github.com) which GitHub makes available. In particular, the guides:
* [Mastering markdown](https://guides.github.com/features/mastering-markdown/)
* [Documenting your projects on GitHub](https://guides.github.com/features/wikis/)
* [GitHub Handbook](https://guides.github.com/introduction/git-handbook/)
* GitHub handouts distributed at the beginning of the lab session

As for a markdown cheatsheet, [this GitHub repository](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet) serves as a useful online, single-page guide.

## Bibliomancy

![Book shelf](https://cs.allegheny.edu/sites/dluman/cmpsc100/img/lab-07-bookcase.png)

Now that all the excitement around G. Wiz's win on "FizzBuzz" has subsided, he can dedicate himself to another wizardly hobby: collecting tomes. He's taken a small portion of his winnings and purchased a few to add to his library, a list which he has given you in the `inputs/book.list` file. This file is _tab delimited_.

To continue his collection, he needs a couple of things from you:

* A print-friendly list of the books in the collection in the format of:

```
TITLE
AUTHOR
PAGE COUNT
```

* An estimate of how many "linear feet" his collection currently takes up so that he can buy a shelf using the following forumula converting page counts to linear feet:

```
(NUMBER OF PAGES) * .005 = (WIDTH OF BOOK IN INCHES)
```

## Required deliverables

A successful submission for this lab includes two (2) Java files and one (1) `reflection.md` file.

- [ ] The repository should have at least 5 commits

### `DisplayLibrary.java`

- [ ] Contains no `TODO` markers
- [ ] Contains no `{Your Name Here}` markers
- [ ] Contains at least 10 single-line comments
- [ ] Contains at least 4 multi-line comments
- [ ] Imports all required libraries
- [ ] Implements a `File` which loads `inputs/book.list`
- [ ] Implements a `Scanner` to read each line of the `File`
- [ ] Implements a `Scanner` using `tab` as a delimiter to read data contained in each line
- [ ] Implements an `ArrayList` to store objects of the `Book` type
- [ ] Uses a `while` loop to `iterate` over the file
- [ ] Uses a `while` loop to `iterate` over the data
* This may require using an identifer to track which "field" your scanner is reading
- [ ] Creates a `Book` object to store book data
- [ ] Uses the correct methods of a `Book` object to set:
* Author
* Title
* Page count
- [ ] Initializes an identifier to track the amount of shelf space books take up
- [ ] Uses a `while` loop to print the contents of the `ArrayList` containing book objects
- [ ] Uses correct methods of `ArrayList` to `get` values and `size`
- [ ] Prints the final calculation of shelf space the tomes take up

A successful output should appear exactly like the following: 

```
There are 20 books:

Potions for Fun and Profit
Wiz Ard
123 pages

Potions in the Kitchen
Cook King
125 pages

Reptiles vs. Cats
Al E. Gator
724 pages

Reptile Digitomancy
T.H. Umbs
913 pages

Gator Wizard Quarterly: Vol. 1
Various
124 pages

Some Very Evil Magic
Don T. Reedthius
1945 pages

World Reptiles
Cosmo Politan
1484 pages

Spells Which are Probably Evil
Forb Idden
412 pages

Gator Wizard Quarterly: Vol. 2
Various
152 pages

Notions of Potions
Wiz Ard
99 pages

Potion Commotion: an Account of Failed Experiments
G. Wiz
50 pages

Representative Reptiles
Govern Ment
103 pages

Gator Wizard Quarterly: Vol. 3
Various
103 pages

Cats vs. Reptiles
Ulysses S. Cat
106 pages

How to Cackle: Flourishes for Evil Spells
Cru L.
75 pages

Gator Wizard Quarterly: Vol. 4
Various
176 pages

A Study of the Impact of Hats on Magical Style
Poin T. Lidz
58 pages

Spells You Shouldn't Ever Case
N.O. Looking
253 pages

Gator Wizard Quarterly: Vol. 5
Various
145 pages

TEMPORARY TITLE
Ulysses S. Cat
716 pages

Shelf width is 3.29 feet.

```

### `Book.java`

- [ ] Contains no `TODO` markers
- [ ] Contains no `{Your Name Here}` markers
- [ ] Correctly implements the formula to calculate individual book width (in inches) as part of the `setWidth` method
- [ ] Implements a method titled `getWidth` which returns an individual book's width (in inches)

### `reflection.md`

- [ ] Contains no `TODO` placeholder markers
- [ ] Contains at least 500 words
- [ ] Contains at least 10 headings
- [ ] Uses at least 3 code blocks
- [ ] Responds to _all_ questions

## GatorGrader

### Docker `container`

If you do not already have the GatorGrader `container`, in a new terminal or Docker Quickstart Terminal, type `docker pull gatoreducator/dockagator` to download the correct `container`.

In the last lab session, we were able to get Docker `container` versions of GatorGrader working! That means that everyone can choose to use the `container` if they'd like. Here are a couple of ways to do it.

#### Running GatorGrader directly on `container` start

* Be sure that you are in the main directory of your practicals repository when running these commands, or you'll certainly experience issues!
* Remember that if you run `ls -la`, you should see a `.git` folder if you're in the main repository folder.
* To make sure you're in the right repository, run a `pwd` command.
    * If you recieve the expected path, you're in the right place. Else, find your way to the right location.

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator
```

#### Run `gradle` commands in the container`

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator /bin/bash
```

- [ ] To `build` your Java work, type `gradle build` at the `command` prompt and press the `Enter` key.
- [ ] To `grade` your Java work, type `gradle grade` at the `command` prompt and press the `Enter` key.

### Using `gradle` commands directly

- [ ] In a terminal, ensure you're in the main folder of your practical repository and type `gradle build`
- [ ] After the `command` completes successfully, type `gradle grade`

## `commit` your work

When you've finished your work: remember that there are three (3) steps to submitting a `git` repository: to "pack," to "label," and to "ship."

* Note: attempt all of these from the main directory of the repository.

- [ ] To "pack" the submission: `git add .`
- [ ] To "label" the submission: `git commit -m "{ADD MESSAGE DESCRIPTING PURPOSE OF COMMIT HERE}"`
- [ ] To "ship" the submission: `git push`