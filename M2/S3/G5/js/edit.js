
    let namePr= document.querySelector('.inputName')
    let brand= document.querySelector('.inputBrand')
    let price= document.querySelector('.inputPrice')
    let imageUrl= document.querySelector('.inputUrl')
    let description= document.querySelector('.inputDescription')
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

   


    namePr.value= dato.name
    brand.value= dato.brand
    price.value=dato.price
    imageUrl.value= dato.imageUrl
    description.value=dato.description

})


let deleteBtn= document.querySelector('#deleteBtn')

deleteBtn.addEventListener('click',function(){

    fetch(`https://striveschool-api.herokuapp.com/api/product/${id}`, {
    method:'DELETE',
headers: {
    'Content-Type':'application/json',
"Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZDZkYzJkN2IxMTAwMTkwZTZkZDMiLCJpYXQiOjE3MDk4ODkyNDQsImV4cCI6MTcxMTA5ODg0NH0.cxOR-1uqpuky5b9rUqIREOTKcy2HG174YoDwJTxQUww"
},
})
.then(res=>res.json())
.then(dati=> {

    location.href= 'index.html'
    
})

})

let reset = document.querySelector('#resetBtn')

reset.addEventListener('click',function(){
    
    location.reload()

})

let saveChanges= document.querySelector('#saveBtnEdit')

saveChanges.addEventListener('click',function(e){
    e.preventDefault()
    
        let nuovoDato={

            name: namePr.value,
            brand:brand.value,
            price:price.value,
            imageUrl:imageUrl.value,
            description: description.value
        }
    
    fetch(`https://striveschool-api.herokuapp.com/api/product/${id}`, {
        method:'PUT',
    headers: {
        'Content-Type':'application/json',
        "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZDZkYzJkN2IxMTAwMTkwZTZkZDMiLCJpYXQiOjE3MDk4ODkyNDQsImV4cCI6MTcxMTA5ODg0NH0.cxOR-1uqpuky5b9rUqIREOTKcy2HG174YoDwJTxQUww"
    },
    body:JSON.stringify(nuovoDato)
    })
    .then(res=>res.json())
    .then(dato=> {
        
        console.log(dato);
        
        
        location.href= 'index.html'
        
    })

})
