const carre = (nombre) => {
    const nombreStr = nombre.toString()
    return nombreStr.split("").map(
        element => {
            return Math.pow(parseInt(element), 2)
            // return parseInt(element) * parseInt(element)
        }
    ).join('')
}

export default carre;