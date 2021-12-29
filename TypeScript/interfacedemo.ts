interface Emp{
    name:string;
    age:number;
    salary?:number;// ? this will use or not (optional)
    display?():string;
}

var emp={'name':'sagar','age':22,'salary':20000,'city':'blore'};//here the obj is or interface not called 
                                                            //it will accepy any values
console.log(emp.city);

var e1:Emp={'name':'sagar','age':22,'salary':20000};//this will invoke interface variables

var e2:Emp={
    'name':'sagar',
    'age':22,
     display: (): string =>{
     return "Hi this is text demo";

     }
};//here sal is not used


console.log('---------------');

console.log("Emp name :"+ e1.name);
console.log("Emp age :"+ e1.age);
console.log("emp sal :"+ e1.salary);

console.log('---------------');

console.log("Emp name :"+ e2.name);
console.log("Emp age :"+ e2.age);
console.log("emp details :"+ e2.display());