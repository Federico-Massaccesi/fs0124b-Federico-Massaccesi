let reset = document.querySelector('#resetBtn')

reset.addEventListener('click',function(){

    location.reload()

})

class ModelloTelefono{

    constructor(_name,_description,_brand,_imageUrl,_price) {

        this.name = _name;
        this.description= _description;
        this.brand=_brand;
        this.imageUrl= _imageUrl;
        this.price= _price
        
    }
    
}

let save = document.querySelector('#saveBtn')



save.addEventListener('click',function(){

    let name= document.querySelector('.inputName').value
    let brand= document.querySelector('.inputBrand').value
    let price= document.querySelector('.inputPrice').value
    let url= document.querySelector('.inputUrl').value
    let description= document.querySelector('.inputDescription').value


    let newCard= new ModelloTelefono(name,description,brand,url,price)

    fetch('https://striveschool-api.herokuapp.com/api/product/', {
    method:'POST',
headers: {
    'Content-Type':'application/json',
"Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZDZkYzJkN2IxMTAwMTkwZTZkZDMiLCJpYXQiOjE3MDk4ODkyNDQsImV4cCI6MTcxMTA5ODg0NH0.cxOR-1uqpuky5b9rUqIREOTKcy2HG174YoDwJTxQUww"
},
body:JSON.stringify(newCard)
})
.then(res=>res.json())
.then(dati=> {

    location.href= 'index.html'

})



})