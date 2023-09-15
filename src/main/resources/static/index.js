let marsApiButtons = document.getElementById("marsApiButtons");

marsApiButtons.addEventListener('click', function (event) {
    if (event.target && event.target.id.startsWith("marsApi")) {
        const buttonId = event.target.id;
        const roverId = buttonId.split("marsApi")[1];
        alert(roverId)
    }
});