const { useEffect } = require("react");


const objeto ={ nome: "cesar", idade:14}
useEffect(() =>{
    const { nome, idade} = objeto;
    console.log(nome);
}, [])

// { nome : "davi" , descricao: "Ga"}