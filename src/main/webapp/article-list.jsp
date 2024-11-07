<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Articles List</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Styles/articles.css" />
</head>
<body>
    <h2>Articles List</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Created At</th>
            <th>View</th>
            <th>Edir</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="article" items="${listArticles}">
            <tr>
                <td class="centered">${article.id}</td>
                <td><i class="fas fa-file-alt icon"></i>${article.title}</td>
                <td><i class="fas fa-user icon"></i>${article.author}</td>
                <td class="centered"><i class="fas fa-calendar-alt icon"></i>${article.createdAt}</td>
                <td class="centered action-icons">
                    <a href="${pageContext.request.contextPath}/articles/details?id=${article.id}" class="view-icon">
                        <i class="fas fa-eye"></i>
                    </a>
                </td>
                <td class="centered action-icons">
                    <a href="${pageContext.request.contextPath}/articles/edit?id=${article.id}" class="edit-icon">
                        <i class="fas fa-edit"></i>
                    </a>
                </td>
                <td class="centered action-icons">
                    <a href="${pageContext.request.contextPath}/articles/delete?id=${article.id}" class="delete-icon" onclick="return confirm('Are you sure?');">
                        <i class="fas fa-trash"></i>
                    </a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div class="center-button">
        <a href="${pageContext.request.contextPath}/articles/new" class="add-article-button">
            <i class="fas fa-plus-circle"></i> Add New Article
        </a>
    </div>
</body>
</html>
