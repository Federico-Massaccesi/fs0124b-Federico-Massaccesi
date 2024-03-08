
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
    
    fetch(`https://striveschool-api.herokuapp.com/api/product/${id}`, {
        method:'PUT',
    headers: {
        'Content-Type':'application/json',
        "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZDZkYzJkN2IxMTAwMTkwZTZkZDMiLCJpYXQiOjE3MDk4ODkyNDQsImV4cCI6MTcxMTA5ODg0NH0.cxOR-1uqpuky5b9rUqIREOTKcy2HG174YoDwJTxQUww"
    },
    body:JSON.stringify()
    })
    .then(res=>res.json())
    .then(dato=> {
        
        console.log(dato);

        // dato.name= namePr.value
        // dato.brand=brand.value
        // dato.price=price.value
        // dato.imageUrl=imageUrl.value
        // dato.description= description.value
        
        
        // location.href= 'index.html'
        
    })

})
