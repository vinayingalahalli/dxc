function validateLogin() {
    let username = document.loginform.username.value;
    let password = document.loginform.password.value;
    let userflag=validateUsername(username);
    let passwordflag=validatePassword(password);
    if (!userflag || !passwordflag) {
        return false;
    } else {
        return true;
    }
}

function validateUsername(username) {
    let message="";
    if(username===undefined || username===null || username.length==0){
        message="Username cannot be empty";
    }
    if(username.length>10){
        message="Username is too long and is invalid";
    }

    document.getElementById("errorUserName").innerText=message;
    if(message.length==0){
        return true;
    }else{
        return false;
    }

}

function validatePassword(password) {
    let message="";
    if(password===undefined || password===null || password.length==0){
        message="Password cannot be empty";
    }
    if(password.length>13){
        message="Password is too long and is invalid";
    }

    document.getElementById("errorPassword").innerText=message;
    if(message.length==0){
        return true;
    }else{
        return false;
    }
}