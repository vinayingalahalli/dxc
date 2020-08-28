function getAllGitUsers() {
    const url = 'https://api.github.com/users';
    fetch(url)
    .then(res1=>res1.json())
    .then(res=>{
        console.log(res);
        let data = "<h3><u>GITHUB Users List with FETCH Promise Style</u></h3>";
                data = data + "<table id='usersList' class='table table-primary table-striped table-hover table-bordered'>";
                data = data + "<thead class='thead-light'><tr><th>ID</th><th>Login Name</th><th>Avatar Image</th></thead>"
                res.forEach(element => {
                    data = data + "<tr><td>" + element.id + "</td>";
                    data = data + "<td>" + element.login + "</td>";
                    data = data + "<td><img alt='GIT USER Image' style='height:150px;width:150px' class='rounded-circle' src='" + element.avatar_url + "'/></td></tr>";
                });
                data = data + "</table>"
                document.getElementById("results").innerHTML = data;
    })
}
//modify this to fetch API 
function getGitUserByLoginId() {
    let login = document.getElementById("gitid").value;

    if (login === null || login === undefined || login.length === 0) {
        document.getElementById("error").innerText = "Please enter id to search for GITHUBUSER";
    } else {
        document.getElementById("error").innerText ="";
        const url = 'https://api.github.com/users/'+login;
        let xhr = new XMLHttpRequest();
        xhr.open('GET', url, true);

        xhr.onload = function () {
            if (this.readyState === 4 && this.status === 200) {
                let res = JSON.parse(this.responseText);
                console.log(res);
                let data = "<h3><u>GITHUB User with Login ID "+login+" </u></h3>";
                data = data + "<table id='usersList' class='table table-primary table-striped table-hover table-bordered'>";
                data = data + "<thead class='thead-light'><tr><th>ID</th><th>Login Name</th><th>Avatar Image</th></thead>"
               // res.forEach(element => {
                    data = data + "<tr><td>" + res.id + "</td>";
                    data = data + "<td>" + res.login + "</td>";
                    data = data + "<td><img alt='GIT USER Image' style='height:150px;width:150px' class='rounded-circle' src='" + res.avatar_url + "'/></td></tr>";
              //  });
                data = data + "</table>"
                document.getElementById("results").innerHTML = data;
            }
        }
        xhr.send();
    }

}