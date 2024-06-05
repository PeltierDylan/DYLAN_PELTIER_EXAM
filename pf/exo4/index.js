import toWhiteAndBlack from "./grey.js"

const RGB = [
    [[123, 231, 12], [56, 43, 124]],
    [[78, 152, 76], [64, 132, 200]]
]

const result = [
    [[122, 122, 122], [74, 74, 74]],
    [[102, 102, 102], [132, 132, 132]]
]
console.log("Tableau de base: ")
console.log(RGB)
console.log("########")
console.log("TAbleau après passage dans la fonction: ")
console.log(toWhiteAndBlack(RGB))
console.log("########")
console.log("Résultat attendu: ")
console.log(result)
console.log("########")