function clonaTemplate(){

    let template= document.getElementById('templateDetails')

    let cloneT= template.content.cloneNode(true)

    return cloneT

}

let url= new URLSearchParams(location.search)

let id= url.get('id')


fetch(`https://striveschool-api.herokuapp.com/api/product/${id}`, {
    method:'GET',
headers: {
    'Content-Type':'application/json',
"Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZDZkYzJkN2IxMTAwMTkwZTZkZDMiLCJpYXQiOjE3MDk4ODkyNDQsImV4cCI6MTcxMTA5ODg0NH0.cxOR-1uqpuky5b9rUqIREOTKcy2HG174YoDwJTxQUww"
}

})
.then(res=> res.json())
.then(dato=>{

        let card = clonaTemplate()
        
        
        let img = card.querySelector('.img-fluid')
        
        img.src= dato.imageUrl
        
        let brand = card.querySelector('#brand')

        brand.innerText= dato.brand

        let nomeCell= card.querySelector('.card-title')
        
        nomeCell.innerText= dato.name
        
        let description = card.querySelector('#description')
        
        description.innerText= dato.description

        let price = card.querySelector('#price')

        price.innerText= `${dato.price}€`
        

        
        let place = document.querySelector('#appendCard')
        place.append(card)

})