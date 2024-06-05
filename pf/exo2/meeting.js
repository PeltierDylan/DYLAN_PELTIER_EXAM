const sumRepas = (list) => {
    return list.reduce((acc, item) => {
        if (item.repas === 'végétarien') {
            acc.végétarien += 1;
        } else if (item.repas === 'vegan') {
            acc.vegan += 1;
        } else {
            acc.standard += 1;
        }
        return acc;
    }, { végétarien: 0, standard: 0, vegan: 0 });

}
export default sumRepas;