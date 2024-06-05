import sumRepas from "./meeting.js";

var list1 = [
    {
        FirstName: 'Noah', lastName: 'M.', pays: 'Suisse', continent: 'Europe', age: 19, langue: 'C', repas: 'végétarien'
    },
    {
        FirstName: 'Anna', lastName: 'R.', pays: 'Liechtenstein', continent: 'Europe', age: 52, langue: 'JavaScript', repas: 'standard'
    },
    {
        FirstName: 'Ramona', lastName: 'R.', pays: 'Paraguay', continent: 'Amériques', age: 29, langue: 'Ruby', repas: 'vegan'
    },
    {
        FirstName: 'George', lastName: 'B.', pays: 'Angleterre', continent: 'Europe', age: 81, langue: 'C', repas: 'végétarien'
    },
];


console.log(sumRepas(list1))