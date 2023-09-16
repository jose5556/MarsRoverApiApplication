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


const roverType = getParameterByName("marsRoverApi")

if (roverType == "Curiosity") {

        document.getElementById("marsApiCuriosity").classList.remove("btn");
        document.getElementById("marsApiCuriosity").classList.remove("btn-secondary");
        document.getElementById("marsApiCuriosity").classList.remove("btn-lg");
        document.getElementById("marsApiCuriosity").classList = "btn btn-primary btn-lg";

} else if (roverType == "Opportunity") {

        document.getElementById("marsApiOpportunity").classList.remove("btn");
        document.getElementById("marsApiOpportunity").classList.remove("btn-secondary");
        document.getElementById("marsApiOpportunity").classList.remove("btn-lg");
        document.getElementById("marsApiOpportunity").classList = "btn btn-primary btn-lg";

} else if (roverType == "Spirit") {

        document.getElementById("marsApiSpirit").classList.remove("btn");
        document.getElementById("marsApiSpirit").classList.remove("btn-secondary");
        document.getElementById("marsApiSpirit").classList.remove("btn-lg");
        document.getElementById("marsApiSpirit").classList = "btn btn-primary btn-lg";

} else {

        document.getElementById("marsApiCuriosity").classList.remove("btn");
        document.getElementById("marsApiCuriosity").classList.remove("btn-secondary");
        document.getElementById("marsApiCuriosity").classList.remove("btn-lg");
        document.getElementById("marsApiCuriosity").classList = "btn btn-primary btn-lg";
}


