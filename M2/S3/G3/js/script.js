

fetch('https://striveschool-api.herokuapp.com/books')
.then(res=> res.json())
.then(dati=>{

    console.log(dati);
for(el of dati){

    let row= document.querySelector('.row')

//DIVTOTALE
    let cardTotal=document.createElement('div')

    cardTotal.classList.add('card')

    cardTotal.style.width='18rem'

//IMG

    let img = document.createElement('img')

    img.classList.add('card-img-top')

    img.style.height='100%'

    img.setAttribute('src',el.img)

//CARDBODY

    let divBody = document.createElement('div')

    divBody.classList.add('card-body')

    let title= document.createElement('h5')

    title.classList.add('card-title')

    title.innerText = el.title

    let price = document.createElement('p')

    price.classList.add('card-text')

    price.innerText= `Prezzo: ${el.price} €`

    
    //BUTTON
    
    let button =document.createElement('button')
        
    button.classList.add('btn','btn-primary')

    button.innerText= 'Elimina'

    button.addEventListener('click',function(){

        row.removeChild(cardTotal)
    })
    
    //APPEND
    divBody.append(title,price,button)

    cardTotal.append(img,divBody)

    row.append(cardTotal)

}
})
