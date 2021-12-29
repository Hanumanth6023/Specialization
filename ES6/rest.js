console.log("Rest operator");

// function add(...a){

//     var b=0;
//     for(const i of a){
//         b=b+i;
//     }

//     console.log(b);
// }

function add(c,...a)//first 1 will print and then remain values add and store in a; we can add more varivables before rest operator only.
{

    var b=0;
    for(const i of a){
        b=b+i;
    }
    console.log(c);
    console.log(b);
}

// function add(...a)//it will print all elements and store in array.
// {

    
//     for(const i of a){
        
//     }
//     console.log(a);
    
// }

add(1,2);
add(1,2,3);
add(1,2,3,4);

console.log('spread operator-------------------');

var arr=[1,2,3,4];
var arr1=[1,2,3,4];

var arr2=[arr,arr1];//in one array two arrays
var arr2=[...arr,...arr1];// make it single array
console.log(arr2);

console.log(arr);
console.log(...arr1,...arr);//normal way printing

