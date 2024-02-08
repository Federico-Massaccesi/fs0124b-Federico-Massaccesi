
for(let i =1;i<=76;i++){
    
    let numero = document.createElement('div')
    
    numero.classList.add('tabella')
    
    numero.classList.add(i)

    let tabellaTotale = document.querySelector('.table-container')

    numero.innerText= i
    
    

    tabellaTotale.append(numero)
    

    //tabella creata sopra 

}



let button = document.querySelector('.btn')




button.addEventListener('click', ()=> {

    let random = Math.floor(Math.random() * (1,76)+1)
    
    const numeroRosso= document.querySelector('.table-container .tabella:nth-child('+ random +')')

numeroRosso.classList.add('estratto')
})

