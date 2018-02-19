<%--to refer to the header.jsp to use header--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Product Details</h1>
            <p class="lead">Here is the detail information of the product</p>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-md-5">
                    <img src="#" alt="image" style="width:100px; height:300px;" />
                </div>
                <div class="col-md-5">
                    <h3>Product Name</h3>
                    <p>Product Description</p>
                    <p>Manufacturer</p>
                    <p>Category</p>
                    <p>Condition</p>
                    <p>Price</p>
                </div>
            </div>
        </div>
        <%--footer template--%>
<%@include file="/WEB-INF/views/template/footer.jsp"%>