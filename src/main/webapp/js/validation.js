function validateForm() {
    var email = document.getElementById("email").value;
    var atIndex = email.indexOf("@");
    var dotIndex = email.lastIndexOf(".");

    if (atIndex < 1 || dotIndex <= atIndex + 2 || dotIndex + 2 >= email.length) {
        alert("Please enter a valid email address");
        return false;
    }

    return true;
}

$(document).ready(function() {
    $("#username").blur(function() {
        var username = $(this).val();
        $.ajax({
            url: "check-username",
            type: "POST",
            data: { username: username },
            success: function(response) {
                if (response == "unavailable") {
                    $("#usernameError").text("Username is already taken");
                } else {
                    $("#usernameError").text("");
                }
            }
        });
    });
});
