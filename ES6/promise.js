var pr=new Promise((resolve,reject)=>{


var condition=true;
if(condition){

    console.log('Enter your pin')
    resolve('successful money withdraw');
    
}
else{
    console.log('insufficient funds...')
    reject('amount is grater than your balance');
}



} );

// pr.then(success,failure);
// pr.then(success).catch(failure)//like this also perform
pr.then(success).catch(failure).finally(def);

function success(msg){

    console.log('promise is successful');
    console.log(msg);
}


function failure(msg){

    console.log('promise is not successfull');
    console.log(msg);
}

function def(){
    console.log('finally block is executed')
}

//pending
//fulfied
//reject