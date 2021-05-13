<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Appoinment</title>

<script src="static/js/bootstrap.min.js"></script>
<link href="static/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>


	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-md-6">
						<form class="form-horizontal" action="appoinment"
							method="POST">
							<fieldset>

								<!-- Form Name -->
								<legend>Appoinment Add</legend>


								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="name">Name</label>
									<div class="col-md-4">
										<input id="name" name="name" type="text" placeholder=""
											class="form-control input-md">

									</div>
								</div>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="problem">Problem</label>
									<div class="col-md-4">
										<input id="problem" name="problem" type="text" placeholder=""
											class="form-control input-md">

									</div>
								</div>

								<div class="form-group">
									<label class="col-md-4 control-label" for="appoinmentdate">Appoinment Date</label>
									<div class="col-md-4">
										<input id="appoinmentdate" name="appoinmentdate" type="date" placeholder=""
											class="form-control input-md">

									</div>
								</div>

								<div class="form-group">
									<label class="col-md-4 control-label" for="currentdate">Current Date</label>
									<div class="col-md-4">
										<input id="currentdate" name="currentdate" type="date" placeholder=""
											class="form-control input-md">

									</div>
								</div>

								<!-- Button -->
								<div class="form-group">
									<label class="col-md-4 control-label" for="add"></label>
									<div class="col-md-4">
										<input type="submit" class="btn btn-info" value="Add Appoinment">
									</div>
								</div>

							</fieldset>
						</form>
					</div>
					<div class="col-md-6"></div>
				</div>

				<div class="row">
					<div class="col-md-6">
						<legend>Appoinment List</legend>
						<div class="table-responsive">
							<table id="example" class="table table-striped table-bordered">
								<thead>
									<tr>
										<th>Id</th>
										<th>Name</th>
										<th>Problem</th>
										<th>Appoinment Date</th>
										<th>Current Date</th>
										<th>Action</th>
										<th>Action</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${allAppoinment}" var="appoinment">
										<tr>
											<td><c:out value="${appoinment.id}" /></td>
											<td><c:out value="${appoinment.name}" /></td>
											<td><c:out value="${appoinment.problem}" /></td>
											<td><c:out value="${appoinment.appoinmentdate}" /></td>
											<td><c:out value="${appoinment.currentdate}" /></td>
											<td><a href="appoinment/remove?id=${appoinment.id}"
												class="btn btn-danger" type="button">Delete</a></td>
											<td><a href="appoinment/searchbyid?id=${appoinment.id}"
												class="btn btn-danger" type="button">Search</a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
					<div class="col-md-6"></div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>