$(document).ready(function() {

	$('#btnRegister').click(function(event) {
		event.preventDefault();
		var x = $("#firstname").val();
		var y = $("#lastname").val();
		var z = $("#email").val()
		var t = $("#addresss").val()
                var phone = $("#phone").val()
		var t1 = $("#username").val()
		var t2 = $("#password").val()
		var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

		if (x === null || x === "" || x.length <= 0) {
			alert("Please fill firstname!!");
			return false;
		} else if (y === null || y === "") {
			alert("Please fill lastname!!");
			return false;
                } else if (phone === null || phone === "") {
			alert("Please fill phone!!");
		return false;
		} else if (z === null || z === "") {
			alert("Please fill email!!");
			return false;
		} else if (!filter.test(z)) {
			alert('Please fill correct email!!');
			z.focus;
			return false;
		} else if (t === null || t === "") {
			alert("Please fill city!!");
			return false;
		} else if (t1 === null || 1 === "") {
			alert("Please fill username!!");
			return false;
		} else if (t2 === null || t2 === "") {
			alert("Please fill password!!");
			return false;
		} 
		
//		save();
	});



});
