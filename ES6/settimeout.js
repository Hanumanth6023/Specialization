class abc{

    //using function name
    // constructor()
    // {
    //     setTimeout(function name(){

    //         console.log('hello this is settimeout function 5 sec');

    //     },5000)
    // }

    //using flat arrow function
    constructor()
    {
        setTimeout( ()=>{

            console.log('hello this is settimeout function 5 sec');

        },5000)
    }
}

var a= new abc();


