FROM alpine:3
RUN addgroup hello_group; adduser Javacream --disabled-password --ingroup hello_group
USER Javacream
COPY hello /
CMD ["/hello"]