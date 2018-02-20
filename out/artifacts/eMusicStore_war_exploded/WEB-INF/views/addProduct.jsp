<%--to refer to the header.jsp to use header--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Add Product</h1>
            <p class="lead">Fill the below information to add a product</p>
        </div>

        <%--Spring form--%>
        <%--commandName is the data model that you want to bind--%>
    <form:form action="${pageContext.request.contextPath}/admin/productInventory/addProduct" method="post" commandName="product">
        <div class="form-group">
            <label for="name">Name</label>
            <form:input path="productName" id="name" class="form-Control" />
        </div>
        <div class="form-group">
            <label for="category">Category</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="instrument" />Instrument</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="record" />Record</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="accessory" />Accessory</label>
        </div>
        <div class="form-group">
            <label for="name">Description</label>
            <form:textarea path="productDescription" id="description" class="form-Control" />
        </div>
        <div class="form-group">
            <label for="name">Price</label>
            <form:input path="productPrice" id="price" class="form-Control" />
        </div>
        <div class="form-group">
            <label for="category">Condition</label>
            <label class="checkbox-inline"><form:radiobutton path="productCondition" id="condition" value="new" />New</label>
            <label class="checkbox-inline"><form:radiobutton path="productCondition" id="condition" value="used" />Used</label>
        </div>
        <div class="form-group">
            <label for="category">Status</label>
            <label class="checkbox-inline"><form:radiobutton path="productStatus" id="status" value="active" />Active</label>
            <label class="checkbox-inline"><form:radiobutton path="productStatus" id="status" value="inactive" />Inactive</label>
        </div>
        <div class="form-group">
            <label for="name">Units in Stock</label>
            <form:input path="unitInStock" id="unitInStock" class="form-Control" />
        </div>
        <div class="form-group">
            <label for="name">Manufacturer</label>
            <form:input path="productManufacturer" id="manufacturer" class="form-Control" />
        </div>
        <br><br>
        <input type="submit" value="submit" class="btn btn-success">
        <a href="<c:url value="/admin/productInventory"/>" class="btn btn-danger">Cancel</a>
    </form:form>


        <%--footer template--%>
<%@include file="/WEB-INF/views/template/footer.jsp"%>