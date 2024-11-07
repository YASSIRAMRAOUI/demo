<!-- At the top within the <head> tag -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/Styles/articles.css" />

<body>
    <div class="article-details">
        <h2>${article.title}</h2>
        <p><strong>Author:</strong> ${article.author}</p>
        <p><strong>Created At:</strong> ${article.createdAt}</p>
        <p>${article.content}</p>
        <div class="action-buttons">
            <a href="${pageContext.request.contextPath}/articles/edit?id=${article.id}" class="edit-button">Edit</a>
            <a href="${pageContext.request.contextPath}/articles/delete?id=${article.id}" class="delete-button" onclick="return confirm('Are you sure?');">Delete</a>
            <a href="${pageContext.request.contextPath}/articles/list" class="back-button">Back to Articles List</a>
        </div>
    </div>
</body>
