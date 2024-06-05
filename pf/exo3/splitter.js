const longestWord = (phrase) => {
    const tabWords = phrase.split(" ")
    return tabWords.reduce(
        (longestWord = "", word) => {
            if (word.length >= longestWord.length) {
                return word
            }
        }, 0
    )

}
export default longestWord;