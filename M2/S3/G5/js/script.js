// fetch("https://striveschool-api.herokuapp.com/api/put-your-endpoint-here/", {
// headers: {
// "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZDZkYzJkN2IxMTAwMTkwZTZkZDMiLCJpYXQiOjE3MDk4ODkyNDQsImV4cCI6MTcxMTA5ODg0NH0.cxOR-1uqpuky5b9rUqIREOTKcy2HG174YoDwJTxQUww"
// }
// })

// https://striveschool-api.herokuapp.com/api/product/



class ModelloTelefono{

    constructor(_name,_description,_brand,_imageUrl,_price,_userId) {

        this.name = _name;
        this.description= _description;
        this.brand=_brand;
        this.imageUrl= _imageUrl;
        this.price= _price
        this.userId= _userId
    }
    
}
function clonaTemplate(){

    let template= document.getElementById('template')

    let cloneT= template.content.cloneNode(true)

    return cloneT

}


//GET
fetch("https://striveschool-api.herokuapp.com/api/product/", {
    method:'GET',
headers: {
    'Content-Type':'application/json',
"Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZDZkYzJkN2IxMTAwMTkwZTZkZDMiLCJpYXQiOjE3MDk4ODkyNDQsImV4cCI6MTcxMTA5ODg0NH0.cxOR-1uqpuky5b9rUqIREOTKcy2HG174YoDwJTxQUww"
}

})
.then(res=> res.json())
.then(dati=>{

    for(let el of dati){

        
        console.log(dati);
        let card = clonaTemplate()
        
        
        let img = card.querySelector('.card-img-top')
        
        img.src= el.imageUrl
        
        let nomeCell= card.querySelector('.card-title')
        
        nomeCell.innerText= el.name
        
        let description = card.querySelector('.card-text')
        
        description.innerText= el.description
        
        let modifica= card.querySelector('#modifica')

        modifica.href= `edit.html?id=${el._id}`
        
        
        let row = document.querySelector('.row')
        row.append(card)
    }
        
    })
    
//////////////////////////////////////////////////////////////////

    

