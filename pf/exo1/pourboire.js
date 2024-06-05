const pourboire = (montant, avis) => {
    const switcher = (avis) => {
        switch (avis.toLowerCase()) {
            case 'terrible': return 0
            case 'poor': return 0.05
            case 'good': return 0.1
            case 'great': return 0.15
            case 'excellent': return 0.2
            default: return null
        }
    }
    let rate = switcher(avis)
    if (rate == null) {
        return "Rating not recognised"
    } else {
        return "The tip is " + Math.round(montant * rate) + " euros."
    }
}

export default pourboire;