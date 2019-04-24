$(document)
		.ready(
				function() {
					loadTable();
					function loadTable() {
						var acc = {
							username : $("#username").val(),
							password : $("#password").val(),
							role : $("#role").val(),
						};
						$
								.ajax({
									type : "GET",
									contentType : "application/json",
									url : "./api/v1/",
									data : acc,
									dataType : "json",
									success : function(result) {
										var html = "";
										$
												.each(
														result,
														function(index, item) {
															html += "<tr>";
															html += "<td>"
																	+ (index + 1)
																	+ "</td>";
															html += "<td> "
																	+ item.username
																	+ "</td>";
															html += "<td>"
																	+ item.password
																	+ "</td>";
															html += "<td>"
																+ "<a href =\"/admin/product/detail/"
																+ item.id
																+ "\" id = \"btnDetail"
																+ item.id
																+ "\" class = \"btn btn-info center-block\"><i class = \"glyphicon glyphicon-new-window\"></i>Detail</a></td>";
															html += "<td>"
																	+ "<a href =\"/admin/product/update/"
																	+ item.id
																	+ "\" id = \"btnEdit"
																	+ item.id
																	+ "\" class = \"btn btn-info center-block\"><i class = \"glyphicon glyphicon-edit\"></i>Edit</a></td>";
															html += "<td>"
																	+ "<a href = \"/admin/product/delete/"
																	+ item.id
																	+ "\" id = \"btnDelete"
																	+ item.id
																	+ "\" class = \"btn btn-danger center-block\"><i class = \"glyphicon glyphicon-trash\"></i>Delete</a></td>";
															html += "</tr>";
															index++;
														})
										$("#tbodyContent1").append(html);
										$('#table_id').DataTable({
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
