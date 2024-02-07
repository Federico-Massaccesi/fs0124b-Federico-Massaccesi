
const button = document.getElementById('btn')

button.addEventListener('click', function(e){
    e.preventDefault();
})


let text = document.querySelector('#text')

let div = document.createElement('div')


button.addEventListener('click',()=> document.body.appendChild(div))



