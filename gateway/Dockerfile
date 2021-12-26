FROM node:17-alpine
WORKDIR /home/gateway/src
COPY package*.json ./
RUN npm install
COPY . ./
ARG API_URL
ENV API_URL=${API_URL}
EXPOSE 3000
CMD ["node", "index.js"]