const toWhiteAndBlack = (tableRGB) => {
    return tableRGB.map(element => {
        return element.map(rgb => {
            const average = Math.round((rgb[0] + rgb[1] + rgb[2]) / 3);
            return [average, average, average];
        })
    });
}

export default toWhiteAndBlack;