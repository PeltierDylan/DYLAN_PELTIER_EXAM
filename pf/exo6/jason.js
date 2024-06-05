const killcount = (tableStat, jasonInt) => {
    // return tableStat.map(perso => {
    //     if (perso[1] < jasonInt) {
    //         console.log(perso[0])
    //         return perso[0]
    //     }
    // }
    // )
    return tableStat.filter(
        (perso) => {
            if (perso[1] < jasonInt) {
                return perso
            }
        }
    ).map(
        perso => {
            return perso[0]
        }
    )
}
export default killcount;