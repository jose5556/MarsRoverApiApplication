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

function btnRover(roverType) {

if (roverType == "" || roverType == null) {

        document.getElementById("marsApiOpportunity").classList.remove("btn");
        document.getElementById("marsApiOpportunity").classList.remove("btn-secondary");
        document.getElementById("marsApiOpportunity").classList.remove("btn-lg");
        document.getElementById("marsApiOpportunity").classList = "btn btn-primary btn-lg";

} else {

        document.getElementById("marsApi" + roverType).classList.remove("btn");
        document.getElementById("marsApi" + roverType).classList.remove("btn-secondary");
        document.getElementById("marsApi" + roverType).classList.remove("btn-lg");
        document.getElementById("marsApi" + roverType).classList = "btn btn-primary btn-lg";

        }

}

const marsSol = getParameterByName("marsSol");
document.getElementById("marsSol").value = marsSol;

const marsRoverType = getParameterByName("marsRoverApi");
btnRover(marsRoverType);


var cars = ["fiat", "Volvo", "BMW", "outra", "coisa", "e", "mais", "jj"];

console.log(cars[3.5]);




