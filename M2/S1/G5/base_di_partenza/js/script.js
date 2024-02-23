let navBar= document.querySelector('.header')
let getStarted = document.querySelector('#nav-bar :first-child')
window.addEventListener('scroll',function(){
    
    let scroll= window.scrollY;
    
    
    if(scroll >= 400){

            navBar.style.animationName= 'fromYtoW'
            navBar.style.animationDuration= '800ms'
            navBar.style.animationIterationCount= '1'
            navBar.style.backgroundColor= 'white'
            
            getStarted.style.animationName='fromDarktoLight'
            getStarted.style.animationDuration= '800ms'
            getStarted.style.animationIterationCount='1'
            getStarted.style.backgroundColor='#1a8917'
            
            
            // getStarted.style.backgroundColor= '#1a8917'
            // getStarted.style.color='white'
        }else if(scroll<400){
            
            navBar.style.animationName= 'fromWtoY'
            navBar.style.animationDuration= '800ms'
            navBar.style.animationIterationCount= '1'
            navBar.style.backgroundColor= '#ffc017'

            getStarted.style.animationName='fromLighttoDark'
            getStarted.style.animationDuration= '800ms'
            getStarted.style.animationIterationCount='1'
            getStarted.style.backgroundColor='#191919'
        }
        
    })
    navBar.style.backgroundColor= '#ffc017'