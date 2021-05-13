<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Labtest</title>

<script src="static/js/bootstrap.min.js"></script>
<link href="static/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>


	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-md-6">
						<form class="form-horizontal" action="labtest"
							method="POST">
							<fieldset>

								<!-- Form Name -->
								<legend>Labtest Add</legend>


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
									<label class="col-md-4 control-label" for="rate">Rate</label>
									<div class="col-md-4">
										<input id="rate" name="rate" type="number" placeholder=""
											class="form-control input-md">

									</div>
								</div>


								<div class="form-group">
									<label class="col-md-4 control-label" for="patientid">Patient Id</label>
									<div class="col-md-4">
										<input id="patientid" name="patientid" type="number" placeholder=""
											class="form-control input-md">

									</div>
								</div>

								<!-- Button -->
								<div class="form-group">
									<label class="col-md-4 control-label" for="add"></label>
									<div class="col-md-4">
										<input type="submit" class="btn btn-info" value="Add labtest">
									</div>
								</div>

							</fieldset>
						</form>
					</div>
					<div class="col-md-6"></div>
				</div>

				<div class="row">
					<div class="col-md-6">
						<legend>Labtest List</legend>
						<div class="table-responsive">
							<table id="example" class="table table-striped table-bordered">
								<thead>
									<tr>
										<th>Id</th>
										<th>Name</th>
										<th>Rate</th>
										<th>Patient Id</th>
										<th>Action</th>
										<th>Action</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${allLabTests}" var="labtest">
										<tr>
											<td><c:out value="${labtest.id}" /></td>
											<td><c:out value="${labtest.test}" /></td>
											<td><c:out value="${labtest.rate}" /></td>
											<td><c:out value="${labtest.patientid}" /></td>
											<td><a href="labtest/remove?id=${labtest.id}"
												class="btn btn-danger" type="button">Delete</a></td>
											<td><a href="labtest/findbyid?id=${labtest.id}"
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