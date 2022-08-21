<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
<body>
	<form:form action='processForm' modelAttribute='student'>
		First Name <form:input path='firstName'/>
		<br><br>
		Last Name <form:input path='lastName'/>
		<br><br>
		County: <form:select path='country'>
					<form:options items="${student.countryOptions}"/>
				</form:select>
		<br><br>
		Programming Languages: 
		<br><br>
				C++ <form:radiobutton path='programmingLanguage' value='C++'/>
				Java <form:radiobutton path='programmingLanguage' value='Java'/>
				Python <form:radiobutton path='programmingLanguage' value='Python'/>
		<br><br>
		Operating Systems:
				Windows <form:checkbox path='operatingSystems' value='Windows'/>
				Linux <form:checkbox path='operatingSystems' value='Linux'/>
				Mac OS <form:checkbox path='operatingSystems' value='Mac OS'/>
		<input type='submit' value='Submit'/>
	</form:form>
</body>
</head>
</html>
