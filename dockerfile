FROM nginx:alpine
COPY webpage.html /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]


