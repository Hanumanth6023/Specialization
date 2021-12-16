// function abc(){
//     this.name="This is demo text";
//     console.log(this.name);
//     console.log(this.name.toLocaleLowerCase());
//     console.log(this.name.toUpperCase());
//     this.name=this.name.concat('welcome');

//     console.log(this.name);
//     console.log(this.name.slice(8,10));
//     console.log(this.name.substr(7,10));
//     this.name=this.name.replace('welcome','Demo');

//     console.log(this.name);

// }

// abc();

var cars=["Hundai","TATA","BMW"];
cars[1]="AUDI";
cars.push(new Date());
cars.pop();
for(var i=0;i<cars.length;i++)
{
    console.log(cars[i]);
}
console.log('-----------');

var fruits=new Array();
fruits[0]="banana";
fruits[1]="grapes";
fruits[2]="orange";
fruits[3]="apple";

fruits.sort().reverse();

for (const items of fruits){
    console.log(items);
}

console.log('-----------');

for (const items in fruits){
    console.log(items);
}

console.log('-----------');

var date=new Date("2022-01-01");
console.log(date);
console.log(date.getDate());
console.log(date.getFullYear());
console.log(date.getHours()+':'+date.getMinutes()+":"+date.getSeconds());
console.log(date.getDay());













