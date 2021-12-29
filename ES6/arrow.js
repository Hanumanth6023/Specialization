
//Normal function
// function abc(){
//     console.log("HI");
// }
// abc();

// ()=>//single line code
// sub=()=>{
//     //multi line code
// };

var x=(a,b)=>a+b
console.log(x(10,20))



//anonymus function
 var xyz=(x,y)=>{ 
     console.log(`result  : ${x+y}`)
     return x+y;
    }
xyz(10,20);

function add(x)
{
    var a=x;
    console.log(a);
}
add(xyz(10,10));