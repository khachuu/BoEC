$(document).ready(function() {

	loadTable();

	function loadTable() {
		var acc = {
			username : $("#username").val(),
			password : $("#password").val(),
			role : $("#role").val(),
		};

		$.ajax({
			type : "GET",
			contentType : "application/json",
			url : "./api/v1/",
			data : acc,
			dataType : "json",
			success : function(result) {
				var html = "";
				$.each(result, function(index, item) {
					html += "<tr>";
					html += "<td>" + (index + 1) + "</td>";
					html += "<td>" + item.username + "</td>";
					html += "<td>" + item.password + "</td>";
					if (item.accountRole.role === "ROLE_ADMIN") {
						html += "<td>ADMIN</td>";
					} else {
						html += "<td>USER</td>";
					}
					html += "</tr>";
					index++;
				})
				$("#tbodyContent").append(html);
				$('#example1').DataTable({
					'paging' : true,
					'lengthChange' : true,
					'searching' : true,
					'ordering' : true,
					'info' : true,
					'autoWidth' : true
				});
			},
			error : function(event) {
				alert("Error Get");
			}

		});
	}

});
