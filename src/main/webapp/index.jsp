<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Login Form</title>
    <link rel="stylesheet" href="Styles/index.css">
  </head>
  <body>
    <form action="login" method="POST">
      <h2>Login Form</h2>
      <% String errorMessage = (String) request.getAttribute("errorMessage"); if
      (errorMessage != null) { %>
      <div class="error-message"><%= errorMessage %></div>
      <% } %>
      <div>
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required />
      </div>
      <div>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required />
      </div>
      <div>
        <button type="submit">Login</button>
      </div>
    </form>
  </body>
</html>
