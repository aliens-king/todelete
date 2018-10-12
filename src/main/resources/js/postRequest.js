
	/*;;;;;;;;;;;;;;;;;;;;;;*/
	
	
	
	$( document ).ready(function() {
		console.log("hello");
		// SUBMIT FORM
	    $("#userForm").submit(function(event) {
			// Prevent the form from submitting via the browser.
			event.preventDefault();
			ajaxPost();
			console.log("hello aaa");
		});
	    
	    
	    function ajaxPost(){
	    	alert("reachefd");
	    	// PREPARE FORM DATA
	    	var formData = {
	    			
	    			userName:$("#userName").val(),
					email:$("#email").val(),
					fullName:$("#fullName").val(),
					password:$("#password").val(),
				
					
	    	}
	    	
	    	// DO POST
	    	$.ajax({
				type : "POST",
				contentType : "application/json",
				url : window.location + "/user/save",
				data : JSON.stringify(formData),
				dataType : 'json',
				success : function(result) {
					if(result.status == "Done"){
						$("#postResultDiv").html("<p style='background-color:#7FA7B0; color:white; padding:20px 20px 20px 20px'>" + 
													"Post Successfully! <br>" +
													"---> Customer's Info: FirstName = " + 
													result.data.firstname + " ,LastName = " + result.data.lastname + "</p>");
					}else{
						$("#postResultDiv").html("<strong>Error</strong>");
					}
					console.log(result);
				},
				error : function(e) {
					alert("Error!")
					console.log("ERROR: ", e);
				}
			});
	    	
	    	// Reset FormData after Posting
	    	resetData();
	 
	    }
	    
	    function resetData(){
	    	id:$("#bookId").val(),
			deleted:$("#deleted").val(),
			email:$("#email").val(),
			fullName:$("#fullName").val(),
			password:$("#password").val(),
			userName:$("#userName").val(),
			userStatusId:$("#userStatusId").val()
	    }
	})
	/*– Create a GET request by JQuery Ajax in getrequest.js:


	$( document ).ready(function() {
		
		// GET REQUEST
		$("#getUserId").click(function(event){
			event.preventDefault();
			ajaxGet();
		});
		
		// DO GET
		function ajaxGet(){
			$.ajax({
				type : "GET",
				url : window.location + "api/customer/all",
				success: function(result){
					if(result.status == "Done"){
						$('#getResultDiv ul').empty();
						var custList = "";
						$.each(result.data, function(i, customer){
							var customer = "- Customer with Id = " + i + ", firstname = " + customer.firstname + ", lastName = " + customer.lastname + "<br>";
							$('#getResultDiv .list-group').append(customer)
				        });
						console.log("Success: ", result);
					}else{
						$("#getResultDiv").html("<strong>Error</strong>");
						console.log("Fail: ", result);
					}
				},
				error : function(e) {
					$("#getResultDiv").html("<strong>Error</strong>");
					console.log("ERROR: ", e);
				}
			});	
		}
	})*/
	
	/*$( document ).ready(function() {
		
		// GET REQUEST
		$("#getAllCustomerId").click(function(event){
			event.preventDefault();
			ajaxGet();
		});
		
		// DO GET
		function ajaxGet(){
			$.ajax({
				type : "GET",
				url : window.location + "api/customer/all",
				success: function(result){
					if(result.status == "Done"){
						$('#getResultDiv ul').empty();
						var custList = "";
						$.each(result.data, function(i, customer){
							var customer = "- Customer with Id = " + i + ", firstname = " + customer.firstname + ", lastName = " + customer.lastname + "<br>";
							$('#getResultDiv .list-group').append(customer)
				        });
						console.log("Success: ", result);
					}else{
						$("#getResultDiv").html("<strong>Error</strong>");
						console.log("Fail: ", result);
					}
				},
				error : function(e) {
					$("#getResultDiv").html("<strong>Error</strong>");
					console.log("ERROR: ", e);
				}
			});	
		}
	})*/