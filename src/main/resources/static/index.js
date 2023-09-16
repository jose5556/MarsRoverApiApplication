let marsApiButtons = document.getElementById("marsApiButtons");

marsApiButtons.addEventListener('click', function (event) {
    if (event.target && event.target.id.startsWith("marsApi")) {
        const buttonId = event.target.id;
        const roverId = buttonId.split("marsApi")[1];

        let apiData = document.getElementById("marsRoverApi")
        apiData.value = roverId
        document.getElementById("formRoverType").submit();
    }
});

function getParameterByName(name) {
    name = name.replace(/[\[\]]/g, '\\$&');
    var regex = new RegExp('[?&]' + name + '(=([^&#]*)|&|#|$)');
    var results = regex.exec(window.location.href);
    if (!results) return null;
    if (!results[2]) return '';
    return decodeURIComponent(results[2].replace(/\+/g, ' '));
}


const marsRoverType = getParameterByName("marsRoverApi")


function btnRover(roverType) {

if (roverType == "" || roverType == null) {

        document.getElementById("marsApiCuriosity").classList.remove("btn");
        document.getElementById("marsApiCuriosity").classList.remove("btn-secondary");
        document.getElementById("marsApiCuriosity").classList.remove("btn-lg");
        document.getElementById("marsApiCuriosity").classList = "btn btn-primary btn-lg";

} else {

        document.getElementById("marsApi" + roverType).classList.remove("btn");
        document.getElementById("marsApi" + roverType).classList.remove("btn-secondary");
        document.getElementById("marsApi" + roverType).classList.remove("btn-lg");
        document.getElementById("marsApi" + roverType).classList = "btn btn-primary btn-lg";

        }

}

btnRover(marsRoverType)


