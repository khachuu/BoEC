$(document).ready(function() {

	$('#btnRegister').click(function(event) {
		event.preventDefault();
		var x = $("#firstname").val();
		var y = $("#lastname").val();
		var z = $("#email").val()
		var t = $("#city").val()
		var t1 = $("#username").val()
		var t2 = $("#password").val()
		var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

		if (x === null || x === "" || x.length <= 0) {
			alert("Please fill firstname!!");
			return false;
		} else if (y === null || y === "") {
			alert("Please fill lastname!!");
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
		
		save();
	});

	function save() {
		var cus = {
			customer : {
				account : {
					username : $("#username").val(),
					password : $("#password").val()
				},
				account_roles : {
					username : $("#username").val(),
				},
				fullname : {
					firstname : $("#firstname").val(),
					lastname : $("#lastname").val()
				},
				email : $("#email").val(),
			},
			city : $("#city").val()

		};

		$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "./register/api/v1/",
			data : JSON.stringify(cus),
			dataType : "json",
			success : function(data) {
				alert("Save Done!");
				window.location.href = "./login";
				console.log("Save Done !!: ", data);
			},
			error : function(event) {
				alert("Save Fail !!");
				console.log("Save Fail !!: ", event);
			},done : function(e) {
				console.log("DONE");
			}
		});
	}

});
