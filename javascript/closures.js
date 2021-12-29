
// var demo=(
// function (){
//     let count=0;

    
//     return function(){
//         count+=1;
//         return count;
//     }

// })();

// console.log(demo());
// console.log(demo());
// console.log(demo());

var a=(function(){
    console.log('self invoking')
})();

var b=((a)=>{
    console.lof('arrow function'+a); return a
})(10);

var c=b;
console.log(c);
